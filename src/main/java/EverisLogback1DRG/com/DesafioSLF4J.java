package EverisLogback1DRG.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Desafio SLF4J – Logback – 1.
 * 
 * @author driverog
 *
 */
public class DesafioSLF4J {

	final static Logger LOGGER = LoggerFactory.getLogger(DesafioSLF4J.class);

	/**
	 * Metodo principal del desafio
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		LOGGER.info("Inicio del metodo");

		for (int i = 0; i <= 5000; i++) {

			if (i % 100 == 0) {
				LOGGER.trace("Esta interaccion de número es multiplo de 100 :{}", i);

			} else if (i % 2 == 0) {
				LOGGER.trace("Esta interaccion de número es par :{}", i);
			} else {
				LOGGER.trace("Esta interaccion de número es impar :{}", i);
			}

		}

		LOGGER.info("Fin del metodo");

	}
}
