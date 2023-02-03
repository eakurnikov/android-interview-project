package biz.filmeroo.premier.main

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import biz.filmeroo.premier.R
import biz.filmeroo.premier.api.ApiFilm
import biz.filmeroo.premier.detail.DetailActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.recycler
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.search_view.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), FilmPresenter.View {

    @Inject internal lateinit var presenter: FilmPresenter
    @Inject internal lateinit var adapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setupView()
        presenter.start(this)
    }

    private fun setupView() {
        setContentView(R.layout.activity_main)
        val linearLayoutManager = LinearLayoutManager(this)
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = adapter
        val dividerItemDecoration = DividerItemDecoration(this, linearLayoutManager.orientation).apply {
            setDrawable(AppCompatResources.getDrawable(this@MainActivity, R.drawable.divider)!!)
        }
        recycler.addItemDecoration(dividerItemDecoration)
        adapter.setOnClick { id -> DetailActivity.start(this, id) }
        search_field.inputType = InputType.TYPE_NULL

        search_field.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }
    }

    override fun onDestroy() {
        presenter.stop()
        super.onDestroy()
    }

    override fun displayResults(results: List<ApiFilm>) {
        adapter.submitList(results)
    }

    override fun displayError() {
        Toast.makeText(this, R.string.connection_error, Toast.LENGTH_SHORT).show()
    }
}
