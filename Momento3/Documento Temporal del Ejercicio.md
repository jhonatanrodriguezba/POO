Proyecto - Programacion Orientada a Objetos: Taller Ascensor

Nombre: Jhonatan Rodriguez Bastidas
Curso: POO
Contacto: jhonatan.rodriguezba@campusucc.edu.co
Docente: Jhon Cano
Fecha de Presentación: 12/11/2025

Descripción de la solución de taller:
- Para este caso del ascensor pense en crear distintas clases con los elementos esenciales que lo hacen funcionar y que interactuan con el, por ejemplo:
    - Boton(gracias a este puedo dar vida a mas botones)
    - Piso
    - Puerta
    - Ascensor (Estado del ascensor)
    - Sistema de Control del Ascensor (Desde ahi se define gran parte del comportamiento del ascensor)
    - Clase de Ejecucion (O clase principal)
- Asi, el problema propuesto se vuelve un poco mas manejable, entendiendo de manera clara que cada clase tiene una responsabilidad en especifico, manteniendo siempre una buena organizacion del codigo, facilitando la comprension del comportamiento del ascensor en un entorno cualquiera.
- Entonces primero, me hice una idea de como funciona un ascensor real, por ejemplo tiene botones exteriores en cada piso para pedirlo, las puertas se deben abrir y cerrar, el sistema debe controlar la direccion del movimiento (si es subida o si es de bajada), y tambien se debe tener en cuenta el boton de emergencia. Entonces a partir de esta interpretacion fui realizando el taller.

Diseño de las clases:
- Luego de analizar las partes del ascensor y comprender más el problema, empecé con el diseño de las clases:
    - Clase Boton: Esta clase es la que representa todos los botones del ascensor (por ejemplo destino, osea el piso o boton de emergencia.) Cada boton del ascensor tiene un estado (por ejemplo: si esta presionado o no), esto facilita que tanto los botones internos como los externos puedan comportarse de la misma forma, independientemente de su tipo (funcion)
    - Clase Puerta: esta clase controla las acciones de la puerta, osea abrir y cerrar. En esta clase usé un atributo boolean para indicar el estado (si esta abierta o cerrada).
    - Clase Piso: Esta clase representa los pisos del edificio. Todo piso tiene 2 botones (excepto el más alto [4] y el mas bajo [0 - Sotano]. Esos son los de subida o bajada, ambos para pedir el ascensor de acuerdo al nivel en el que se encuentre.)
    - Clase Ascensor: Esta clase contiene atributos como el piso actual, la direccion, el estado de movimiento y de las puertas, etc. En el metodo moverA implementé el thread.sleep para tardar un poco mas la respuesta del codigo y simular como si el ascensor estuviera trabajando. Me parecio interesante aplicarlo para darle ese toque, aunque por ese lado tuve que acudir a ayudas como por ejemplo videos o asistencia de Copilot en determinados momentos del diseño de las clases. Tambien entre otras funcionalidades, cada que el ascensor llega a un piso, se abren las puertas automaticamente como en la vida real y tambien agregue el metodo de emergencia (activarEmergencia()) que detiene el ascensor por completo y abre las puertas. 
    - Clase ControlAscensor: Esta clase ya pasa a orquestar el flujo general del ascensor, y pide los datos por teclado mediante scanner. Aqui dicidi poner un menu dinamico con 4 opciones para que el que las use pueda decidir que desea hacer, en este caso el menu esta compuesto por:
        1. Llamar el ascensor desde un piso (0-4)
        2. Elegir piso dentro del ascensor (0-4)
        3. Activar Emergencia
        4. Salir del ascensor (como el ascensor se ejecuta dentro de un bucle, con el 4 se termina la ejecución.)