package estudos.java.maratona.jiraya.javacore.Kenumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor); //abstract: usado para indicar que esse metodo em si nao existe,
                                                            //existe apenas a aplicacao dele (no caso, so a sobrescrita)
}
