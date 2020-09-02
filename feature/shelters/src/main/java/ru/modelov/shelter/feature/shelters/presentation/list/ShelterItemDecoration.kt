package ru.modelov.shelter.feature.shelters.presentation.list

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ShelterItemDecoration(private val space: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val startSpace = 16
        outRect.top = when (parent.getChildLayoutPosition(view)) {
            0 -> startSpace
            else -> space
        }

        outRect.bottom =
            if (parent.getChildLayoutPosition(view) == state.itemCount - 1) startSpace else 0
    }
}