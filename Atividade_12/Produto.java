class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double somarPreco(Produto outro) {
        return this.preco + outro.preco;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto 1", 30);
        Produto produto2 = new Produto("Produto 2", 45);

        System.out.println("Soma dos preços: R$ " + produto1.somarPreco(produto2));
    }
}
