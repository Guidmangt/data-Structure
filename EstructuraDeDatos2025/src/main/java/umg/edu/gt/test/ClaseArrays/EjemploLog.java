package umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EjemploLog {
    
    private static final Logger logger = LogManager.getLogger(EjemploLog.class);
    
    public static void main(String[] args) {
        logger.info("Los niveles de log\n");
        logger.trace("Mensaje de nivel TRACE");
        logger.debug("Mensaje de nivel DEBUG");
        logger.info("Mensaje de nivel INFO");
        logger.warn("Mensaje de nivel WARN");
        logger.error("Mensaje de nivel ERROR");
        logger.fatal("Mensaje de nivel FATAL");
    }
    // TRACE: Se utiliza para rastrear el flujo de ejecución del programa en un nivel muy granular.
    // DBUG: usado para escribir mensajes de depuración
    // INFO: Se utiliza para registrar eventos importantes en la ejecución del programa, como el inicio o la finalización de un proceso.
    // WARN:  Se utiliza para registrar advertencias que podrían requerir atención, pero no son críticas.
    // ERROR:  Indica un error que afecta el funcionamiento de la aplicación, pero no la detiene por completo.
    // FATAL: Se utiliza para registrar errores graves que impiden que la aplicación continúe ejecutándose.
    
}
