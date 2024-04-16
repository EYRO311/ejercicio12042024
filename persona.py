class Persona:
    def __init__(self, nombre, edad, ciudad, telefono, ocupacion):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
        self.telefono = telefono
        self.ocupacion = ocupacion

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_edad(self):
        return self.edad

    def set_edad(self, edad):
        self.edad = edad

    def get_ciudad(self):
        return self.ciudad

    def set_ciudad(self, ciudad):
        self.ciudad = ciudad

    def get_telefono(self):
        return self.telefono

    def set_telefono(self, telefono):
        self.telefono = telefono

    def get_ocupacion(self):
        return self.ocupacion

    def set_ocupacion(self, ocupacion):
        self.ocupacion = ocupacion

    def __str__(self):
        return f"Persona(nombre='{self.nombre}', edad={self.edad}, ciudad='{self.ciudad}', telefono='{self.telefono}', ocupacion='{self.ocupacion}')"


if __name__ == "__main__":
    persona1 = Persona("Juan", 30, "Ciudad X", "123456789", "Ingeniero")

    print("Nombre:", persona1.get_nombre())
    print("Edad:", persona1.get_edad())
    print("Ciudad:", persona1.get_ciudad())
    print("Teléfono:", persona1.get_telefono())
    print("Ocupación:", persona1.get_ocupacion())

    persona1.set_edad(35)
    print("Nueva edad:", persona1.get_edad())

    print(persona1)
