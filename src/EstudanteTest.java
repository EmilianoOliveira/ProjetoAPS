import static org.junit.Assert.*;

import org.junit.Test;


public class EstudanteTest {

	@Test
	public void test() {
		
		Estudante e = new Estudante();
		assertTrue("Nome correto", e.getNome().equals("Bruna"));
		assertFalse("Nome incorreto", e.getNome().equals("Emiliano"));
		assertTrue("Idade correta", e.getIdade()== 19);
		assertFalse("IdadeIncorreta", e.getIdade()== 20);
		assertTrue("Matricula OK", e.getMatricula()== 81241349);
		assertFalse("Matricula Errada", e.getMatricula()== 85641840);
		e.setNome("Julia");
		
	}

}
