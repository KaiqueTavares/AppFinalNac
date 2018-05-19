package com.tavares.kaique.nac_kaique_tavares_rm79173

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_senso.*

class SensoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_senso)

        btnCadastro.setOnClickListener {
            CadastroTorcedor()
        }
    }

    fun CadastroTorcedor (){
        val telaConfirmacao = Intent(this,ConfirmacaoActivity::class.java)
        val torcedor = Torcedor(etNome.editableText.toString(),
                spTimes.selectedItem.toString())

        telaConfirmacao.putExtra("torcedor",torcedor)
        startActivity(telaConfirmacao)
    }
}
