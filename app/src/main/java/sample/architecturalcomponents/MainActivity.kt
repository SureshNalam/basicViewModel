package sample.architecturalcomponents

import android.support.v7.app.AppCompatActivity
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var viewModel: DataViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(DataViewModel::class.java)
        initListeners(this)
        displayText(viewModel?.getData().toString())
    }

    fun initListeners(mainActivity: MainActivity) {

        button.setOnClickListener{
            viewModel?.setData(editText.text.toString().trim())
            displayText(viewModel?.getData()!!)
        }

        button2.setOnClickListener{
            mainActivity.recreate()
        }
    }

    fun displayText(str:String){

        textView.setText(str)
    }
}
