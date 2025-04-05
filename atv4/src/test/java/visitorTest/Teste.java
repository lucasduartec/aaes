package visitorTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import visitor.*;

public class Teste {

    @Test
    void deveExibirCarroCsv() {
        Carro carro = new Carro("ABC1234", "FIAT", "MOBI");

        CsvVeiculoVisitor visitor = new CsvVeiculoVisitor();
        assertEquals("Carro,ABC1234,FIAT,MOBI", visitor.exibir(carro));
    }

    @Test
    void deveExibirMotocicletaCsv() {
        Motocicleta motocicleta = new Motocicleta("ABC1234", "YAMAHA", "MT03");

        CsvVeiculoVisitor visitor = new CsvVeiculoVisitor();
        assertEquals("Motocicleta,ABC1234,YAMAHA,MT03", visitor.exibir(motocicleta));
    }

    @Test
    void deveExibirCaminhaoCsv() {
        Caminhao caminhao = new Caminhao("ABC1234", "SCANIA", "770S");

        CsvVeiculoVisitor visitor = new CsvVeiculoVisitor();
        assertEquals("Caminhao,ABC1234,SCANIA,770S", visitor.exibir(caminhao));
    }

    @Test
    void deveExibirCarroXml() {
        Carro carro = new Carro("ABC1234", "FIAT", "MOBI");

        XmlVeiculoVisitor visitor = new XmlVeiculoVisitor();
        assertEquals("<Carro>\n  <placa>ABC1234</placa>\n  <marca>FIAT</marca>\n  <modelo>MOBI</modelo>\n</Carro>", visitor.exibir(carro));
    }

    @Test
    void deveExibirMotocicletaXml() {
        Motocicleta motocicleta = new Motocicleta("ABC1234", "YAMAHA", "MT03");

        XmlVeiculoVisitor visitor = new XmlVeiculoVisitor();
        assertEquals("<Motocicleta>\n  <placa>ABC1234</placa>\n  <marca>YAMAHA</marca>\n  <modelo>MT03</modelo>\n</Motocicleta>", visitor.exibir(motocicleta));
    }

    @Test
    void deveExibirCaminhaoXml() {
        Caminhao caminhao = new Caminhao("ABC1234", "SCANIA", "770S");

        XmlVeiculoVisitor visitor = new XmlVeiculoVisitor();
        assertEquals("<Caminhao>\n  <placa>ABC1234</placa>\n  <marca>SCANIA</marca>\n  <modelo>770S</modelo>\n</Caminhao>", visitor.exibir(caminhao));
    }

    @Test
    void deveExibirCarroJson() {
        Carro carro = new Carro("ABC1234", "FIAT", "MOBI");

        JsonVeiculoVisitor visitor = new JsonVeiculoVisitor();
        assertEquals("{Carro: {placa: 'ABC1234', marca: 'FIAT', modelo: 'MOBI'}}", visitor.exibir(carro));
    }

    @Test
    void deveExibirMotocicletaJson() {
        Motocicleta motocicleta = new Motocicleta("ABC1234", "YAMAHA", "MT03");

        JsonVeiculoVisitor visitor = new JsonVeiculoVisitor();
        assertEquals("{Motocicleta: {placa: 'ABC1234', marca: 'YAMAHA', modelo: 'MT03'}}", visitor.exibir(motocicleta));
    }

    @Test
    void deveExibirCaminhaoJson() {
        Caminhao caminhao = new Caminhao("ABC1234", "SCANIA", "770S");

        JsonVeiculoVisitor visitor = new JsonVeiculoVisitor();
        assertEquals("{Caminhao: {placa: 'ABC1234', marca: 'SCANIA', modelo: '770S'}}", visitor.exibir(caminhao));
    }

}
