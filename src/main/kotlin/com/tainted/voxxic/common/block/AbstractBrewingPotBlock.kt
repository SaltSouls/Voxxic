package com.tainted.voxxic.common.block

import com.tainted.voxxic.common.property.VOXProperties
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import net.minecraft.world.World

//TODO Fix Block Level Properties
//TODO Move Level Properties to BrewingPotBlock
abstract class AbstractBrewingPotBlock(settings: Settings): Block(settings) {

    init {defaultState = defaultState.with(FACING, Direction.NORTH).with(LEVEL, 0)}

    private val SHAPE = createCuboidShape(2.0, 0.0, 2.0, 14.0, 10.0, 14.0)
    override fun getOutlineShape(state: BlockState, view: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape {
        return SHAPE
    }
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        super.appendProperties(builder)
        builder.add(FACING, LEVEL)
    }
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState {
        return this.defaultState.with(FACING, ctx.playerFacing.opposite)
    }

    fun isFull(state: BlockState): Boolean {return state.get(LEVEL) as Int == 7}

    fun incrementFluidLevel(state: BlockState, world: World, pos: BlockPos) {
        val i = state.get(LEVEL) as Int + 1
        world.setBlockState(pos, if(!isFull(state)) state else state.with(LEVEL, i))
    }

    fun decrementFluidLevel(state: BlockState, world: World, pos: BlockPos) {
        val i = state.get(LEVEL) as Int - 1
        world.setBlockState(pos, if(i == 0) state else state.with(LEVEL, i))
    }

    companion object: VOXProperties() {
        val LEVEL = LEVEL_7
        val FACING = Properties.HORIZONTAL_FACING
    }

}