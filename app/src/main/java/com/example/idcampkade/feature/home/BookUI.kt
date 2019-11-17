package com.example.idcampkade.feature.home

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class BookUI : AnkoComponent<ViewGroup> {

    companion object {
        val tvTitleId = 1;
        val tvAuthorId = 2;
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            textView {
                id = tvTitleId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "Belajar Kotlin"
                textSize = 16f // <- it is sp, no worries
                textColor = Color.BLACK
            }

            textView {
                id = tvAuthorId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "Budi Saja"
                textSize = 14f
            }
        }
    }
}