package com.example.teste160623;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;


public class Bancopro extends SQLiteDatabase {

    protected static final String TABELA_HISTORICO = "TABELA_HISTORICO";
    protected static final String USUARIO_ID = "ID";

    public Bancopro(@Nullable Context context) {
        super(context, "ClienteBD", null, 1);
    }

    //É chamado na primeira vez que o banco de Dados(BD) é acessado.
    //Usado também para a criação do banco de dados
    @Override
    public void onCreate(SQLiteDatabase db) {
        String statement = "CREATE TABLE " + TABELA_HISTORICO +
                " (" + USUARIO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT)";
        //"CREATE TABLE TABELA_HISTORICO(USUARIO_ID INTEGER PRIMARY KEY AUTOINCREMENT)";
        db.execSQL(statement);
    }

    //Atualiza a versão do BD.
    //Permite que usuários antigos e novos usem a aplicação mesmo com o BD sofrendo manutenção
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //INSERT INTO tabela_usuario(id) values
    //Para adicionar um usuário
    public void adicionarUsuario(Projeto projeto) {
        //getWritableDatabase() permite a gravação em um banco de dados
        SQLiteDatabase db = this.getWritableDatabase();

        //ContentValues é uma classe que permite armazenar dados agrupados aos pares. Exemplo contentValues.put("nome", value); contentValues.getString("name"). É uma associative array em PHP ou hashmap em outras linguagens.
        ContentValues contentValues = new ContentValues();
        contentValues.put(USUARIO_ID, projeto.getIdUsuario());//coluna nome e valor



    }
}
