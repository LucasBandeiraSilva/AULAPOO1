public class App {
    public static void main(String[] args) throws Exception {
        var jogador = new Jogador("Lucas");
        jogador.receberDano(10);
        System.out.println(jogador.getNome());
        System.out.println(jogador.getHp());
        
        //System.out.println(jogador.nome);
    }
}
