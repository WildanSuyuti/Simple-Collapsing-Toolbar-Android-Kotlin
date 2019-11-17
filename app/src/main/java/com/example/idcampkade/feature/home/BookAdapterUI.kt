package com.example.idcampkade.feature.home

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

class BookAdapterUI(private val list: ArrayList<Book> = arrayListOf()) :
    RecyclerView.Adapter<BookAdapterUI.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder =
        BookViewHolder(
            BookUI().createView(
                AnkoContext.create(parent.context, parent)
            )
        )

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) =
        holder.bindItem(list[position])

    override fun getItemCount(): Int = list.size

    class BookViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView),
        LayoutContainer {

        private val tvTitle: TextView = itemView.find(BookUI.tvTitleId)
        private val tvAuthor: TextView = itemView.find(BookUI.tvAuthorId)

        fun bindItem(book: Book) {
            tvTitle.text = book.title
            tvAuthor.text = book.author
        }

    }
}