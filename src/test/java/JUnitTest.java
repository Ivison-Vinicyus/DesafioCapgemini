import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


import com.mycompany.project_cap.Questao1;
import com.mycompany.project_cap2.Questao2;
import com.mycompany.project_cap3.Questao3;

public class JUnitTest {
    
    public JUnitTest() {
    }
    
    //Teste para verificar se com um número negativo aconteceria algum erro.
    @Test
    void retornarValorNegativo() {
	Questao1 l1 = new Questao1();
	assertEquals("", l1.ladder(-10));
    }
    @Test
    void retornarValor3() {
	Questao1 l2 = new Questao1();
	assertEquals(" *\n" + "**\n" + "", l2.ladder(2));
    }
    @Test
    void retornarValor6() {
	Questao1 l3 = new Questao1();
	assertEquals("     *\n" + "    **\n" + "   ***\n" + "  ****\n" +
                    " *****\n" + "******\n" + "", l3.ladder(6));
    }
    @Test
    void retornarValor0() {
	Questao1 l4 = new Questao1();
	assertEquals("", l4.ladder(0));
    }
    @Test
    void retornarValorCorreto(){
	Questao2 pss1 = new Questao2();
	assertEquals("Saída: Senha atende os requisitos!", pss1.verification("Ya3&ab"));
    }
    @Test
    void retornarValorErrado(){
	Questao2 pss2 = new Questao2();
	assertEquals("Saída: Senha não atende todos os requisitos! Faltam 3 caracteres", pss2.verification("A1@"));
    }
    @Test
    void retornarValorVazio(){
	Questao2 pss3 = new Questao2();
	assertEquals("Saída: Senha não atende todos os requisitos! Faltam 6 caracteres", pss3.verification(""));
    }
    @Test
    void retornarValor2(){
	Questao3 an1 = new Questao3();
	assertEquals("Saída:2", an1.anagram("ovo"));
    }
    @Test
    void retornarValorVazio2(){
	Questao3 an2 = new Questao3();
	assertEquals("Saída:0", an2.anagram(""));
    }
    @Test
    void retornarAnValor3(){
	Questao3 an3 = new Questao3();
	assertEquals("Saída:3", an3.anagram("ifailuhkqq"));
    }
     

}
