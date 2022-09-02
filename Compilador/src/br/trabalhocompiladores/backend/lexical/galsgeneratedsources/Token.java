package br.trabalhocompiladores.backend.lexical.galsgeneratedsources;

public class Token
{
    private int id; // classe codificada
    private String lexeme; // digitado - oq foi reconhecido
    private int position; // posição onde inicia o token

    public Token(int id, String lexeme, int position)
    {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }

    public final int getId()
    {
        return id;
    }

    public final String getLexeme()
    {
        return lexeme;
    }

    public final int getPosition()
    {
        return position;
    }

    public String toString()
    {
        return id+" ( "+lexeme+" ) @ "+position;
    };
}
