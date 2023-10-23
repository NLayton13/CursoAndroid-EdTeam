package com.fcode.cursoedteam

import android.util.Size
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cursoedteam.R

class ArticleAdapter: RecyclerView.Adapter<ArticleAdapter.ArticleAdapterViewHolder>() {

    var articles = listOf<Article>()
        set(value){
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleAdapterViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.images_news, parent, false)
        return ArticleAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleAdapter.ArticleAdapterViewHolder, position: Int) {
        val articles= articles[position]
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    class ArticleAdapterViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val  title : TextView = view.findViewById(R.id.title)
        private  val content : TextView = view.findViewById(R.id.content)

        fun bind(article: Article){
            title.text = article.title
            content.text = article.content
        }
    }


}