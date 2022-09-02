package br.trabalhocompiladores.backend.lexical.galsgeneratedsources;

public interface Constants extends ScannerConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_identificador = 2;
    int t_cint = 3;
    int t_cfloat = 4;
    int t_cchar = 5;
    int t_cstring = 6;
    int t_cometario_de_linha = 7;
    int t_cometario_de_bloco = 8;

}
