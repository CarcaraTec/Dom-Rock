/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rule;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class LimitaCaracteres extends PlainDocument {

    public enum TipoEntrada{
        CNPJ;
    };

    private int quantidadeCaractere;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int quantidadeCaractere, TipoEntrada tpEntrada) {
        this.quantidadeCaractere = quantidadeCaractere;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if (string == null || getLength() == quantidadeCaractere){
            return;
        }

        int totalCaractere = getLength() + string.length();

        // filtro de caracteres
        String regex = "";
        switch(tpEntrada){
            case CNPJ: regex = "[^0-9./-]"; break;
         //   case TELEFONE: regex = "[^\p{IsLAtin}]"; break;
        }
        // fazendo a substituição
        string = string.replaceAll(regex, "");

        if (totalCaractere <= quantidadeCaractere){
            super.insertString(i, string, as);
        }else{
            String nova = string.substring(0, quantidadeCaractere);
            super.insertString(i, nova, as);
        }

    }

}
