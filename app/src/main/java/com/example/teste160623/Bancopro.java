package com.example.teste160623;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class Bancopro extends SQLiteDatabase {

    protected static final String TABELA_HISTORICO = "TABELA_HISTORICO";
    protected static final String USUARIO_ID = "ID";

    public Bancopro(@Nullable Context context) {

        super(context, "UsuarioBD", null, 1);
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
    //@Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //INSERT INTO tabela_usuario(id) values
    //Para adicionar um usuário
    public boolean adicionarUsuario(Projeto projeto) {
        //getWritableDatabase() permite a gravação em um banco de dados
        SQLiteDatabase db = this.getWritableDatabase();

        //ContentValues é uma classe que permite armazenar dados agrupados aos pares.
        ContentValues contentValues = new ContentValues();
        contentValues.put(USUARIO_ID, projeto.getIdUsuario());//coluna nome e valor

        //nullColumnHack é null quando deseja-se adicionar uma linha não nula. Quando intencionalmente deseja inserir uma linha vazia, é necessário informar o valor de uma coluna da tabela usada. No caso da tabela historico, pode ser o id do usúario
        long inserirSucedido = db.insert(TABELA_HISTORICO, null, contentValues);
        db.close();//Sempre fechar o banco de dados após uso.

        //-1 indica que nenhuma linha foi inserida na referida tabela
        return inserirSucedido != -1;


    }

    //Para adicionar um usuário
    public boolean atualizarUsuario(Projeto projeto) {
        SQLiteDatabase db = this.getWritableDatabase(); //getWritableDatabase() permite a gravação em um banco de dados

        ContentValues contentValues = new ContentValues();//ContentValues é uma classe que permite armazenar dados agrupados aos pares. Exemplo contentValues.put("nome", value); contentValues.getString("name"). É uma associative array em PHP ou hashmap em outras linguagens.
        contentValues.put(USUARIO_ID, projeto.getIdUsuario());

        long atualizarSucedido = db.update(TABELA_HISTORICO,
                contentValues,
                USUARIO_ID + "=" + projeto.getIdUsuario(),
                null);//nullColumnHack é null quando deseja-se adicionar uma linha não nula. Quando intencionalmente deseja inserir uma linha vazia, é necessário informar o valor de uma coluna da tabela usada. No caso da tabela usuário, pode ser nome ou idade.
        db.close();//Sempre fechar o banco de dados após uso.

        //-1 indica que nenhuma linha foi inserida na referida tabela
        return atualizarSucedido != -1;


    }

    private SQLiteDatabase getWritableDatabase() {
    }



    /**
     * Método para retornar a lista de usuarios completa.
     * Cria uma lista (listaUsuarios) vazia para preenchimento com as tuplas resultantes da consulta no banco de dados.
     *
     * @return List de objetos Usuario
     */
    public List<Usuario> getListaUsuarios() {//Para importar List, pode ser usado o atalho com Alt+Enter (para escolher a ação) ou Shift+Alt+Enter (para pegar o pacote sugerido pela ferramenta Android Studio). Tem que ser do pacote "java.util.List"

        List<Usuario> listaUsuarios = new ArrayList<>();

        //String queryStatement = "SELECT * FROM TABELA_USUARIO";
        String queryStatement = "SELECT * FROM " + TABELA_HISTORICO;//Considere a linha acima para visualizar a sentença como ela é na prática.

        SQLiteDatabase db = this.getReadableDatabase();//Readable para operações de Select. Fechar após uso.

        //O retorno Cursor serve para receber o resultado do banco e navegar entre os resultados. Fechar após uso.
        //selectionArgs é usado para preencher os parâmetros da SQL para os campus da cláusula WHERE
        try (Cursor cursor = db.rawQuery(queryStatement, null)) {
           
            if (cursor.moveToFirst()) {//moveToFirst retorna true no caso de haver registro(s( proveniente(s) da consulta. Posiciona cursor no primeiro resultado
                //do/while Percorrer o cursor para instanciar objetos da classe Usuario.
                do {
                    int usuarioCod = cursor.getInt(0);//A primeira coluna da tabela usuário é código
                  
                    Usuario usuario = new usuario(USUARIO_ID);//Sempre confira a ordem do construtor

                    listaUsuarios.add(usuario);//Adiciona o objeto usuário a lista.
                } while (cursor.moveToNext());//Enquanto houver um próximo registro (moveToNext)
            } else {
                //A lista está vazia por falta de registro no banco de dados.
            }

            //fechar cursor e base de dados. Com isso, permite que outras pessoas/processos possam utilizar.

            cursor.close();
        }
        db.close();//Fechar o banco de dados para liberar memória e permitir que outros processos assumam a prioridade de consulta de maneira mais rápida

        return listaUsuarios; //retorna a lista com os usuários encontrados no banco de dados
    }

    private SQLiteDatabase getReadableDatabase() {
        return null;
    }


    /**
     * Método para encontrar um usuário no banco de dados e excluí-lo.
     *
     * @param usuario
     * @return true no caso do usuário ser encontrado e excluído
     */
    public boolean excluirUsuario(Projeto usuario) {
        SQLiteDatabase db = this.getWritableDatabase();
        String queryString =
                "DELETE FROM " + TABELA_HISTORICO + " WHERE " + USUARIO_ID + " = " + usuario.getIdUsuario();

        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToFirst()) {
            return true;
        } else {
            return false;
        }

    }
}
