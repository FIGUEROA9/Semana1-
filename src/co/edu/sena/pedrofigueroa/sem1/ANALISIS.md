Sistema de Gestión para una Firma de Abogados

Este documento describe los principales objetos (clases) de un sistema para una firma de abogados, con sus atributos y métodos básicos.

Abogado
Descripción:
Representa a un abogado de la firma.

Atributos:

nombre
apellido
tipo de documento
especialidad (por ejemplo, penal, civil, laboral)
añosDeExperiencia
numero de documento Métodos:
atenderCliente()
redactarDocumento()
representarEnJuicio()
Cliente
Descripción:
Representa a una persona o empresa que contrata los servicios de la firma.

Atributos:

nombre
identificación (DNI, RUC, etc.)
dirección
teléfono
tipoDeCliente (persona natural o jurídica)
Métodos:

solicitarCita()
pagarHonorarios()
firmarContrato()
Caso
Descripción:
Representa un caso legal que la firma lleva.

Atributos:

númeroDeCaso
tipoDeCaso (penal, civil, laboral, etc.)
estado (abierto, cerrado, en proceso)
abogadoAsignado
cliente
Métodos:

actualizarEstado()
agregarEvidencia()
programarAudiencia()
Cita
Descripción:
Representa una reunión entre abogado y cliente.

Atributos:

fecha
hora
lugar
abogado
cliente
Métodos:

confirmarCita()
cancelarCita()
reprogramarCita()
Factura
Descripción:
Representa el cobro de los servicios legales.

Atributos:

númeroDeFactura
fechaEmisión
monto
cliente
estadoPago (pagado, pendiente)
Métodos:

generarFactura()
registrarPago()
enviarFactura()