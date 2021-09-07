package com.tainted.voxxic.common.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import com.tainted.voxxic.common.property.VOXProperties
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction.NORTH
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView

//TODO Fix Block Level Properties
//TODO Move Level Properties to BrewingPotBlock
abstract class AbstractBrewingPotBlock(settings: Settings): Block(settings) {
    init { defaultState = defaultState.with(FACING, NORTH).with(LEVEL, 0)}

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

    companion object: VOXProperties() {
        val LEVEL = LEVEL_7
        val FACING = HORIZONTAL_FACING
    }
}