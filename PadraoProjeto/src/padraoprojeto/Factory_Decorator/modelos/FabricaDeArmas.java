package padraoprojeto.Factory_Decorator.modelos;

public class FabricaDeArmas {
    public static Arma criarArma(String tipo) {
        switch (tipo.toLowerCase()) {
            case "espada":
                return new Espada("Excalibur", "Aço", 50);
            case "arco":
                return new Arco("Arco Élfico", "Madeira encantada", 35);
            case "lanca":
                return new Lanca("Lança do Destino", "Titânio", 40);
            default:
                throw new IllegalArgumentException("Tipo de arma desconhecido: " + tipo);
        }
    }
}

