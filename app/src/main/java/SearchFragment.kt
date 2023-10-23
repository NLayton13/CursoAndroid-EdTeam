package com.fcode.cursoedteam


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.cursoedteam.databinding.ActivityImageRandomBinding
import com.example.cursoedteam.databinding.FragmentSearchBinding
import com.example.cursoedteam.databinding.LinearLayoutBinding

class SearchFragment: Fragment() {

    lateinit var viewBinding: FragmentSearchBinding
    private lateinit var articleAdapter: ArticleAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding= FragmentSearchBinding.inflate(inflater, container, false)
        

        setupList()
        articleAdapter.articles = mockedData
        return viewBinding.root

    }
    fun setupList(){
        articleAdapter = ArticleAdapter()
        viewBinding.recyclerViewList.apply {

            adapter = articleAdapter
            layoutManager = LinearLayoutManager(activity)

            val dividerItemDecoration = DividerItemDecoration(
                this.context,
                VERTICAL
            )
            addItemDecoration(dividerItemDecoration)
        }
    }
}