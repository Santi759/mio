class MyPerson:
    #Inicializamos los atributos de la Persona
    def __init__(self,name="",age=0,dni=""):
        self._name = name
        self._age=age
        self._dni=dni
    
    #Ingresamos un nombre 
    def set_name(self,new_name):
        self._name= new_name
        
    #Ingresamos la edad
    def set_age(self,new_age):
        self._age= new_age
    
    #Ingresamos el dni
    def set_dni(self,new_dni):
        self._dni=new_dni

    #Obtenemos el nombre de la Persona
    def get_name(self):
        return self._name
    
    #Obtenemos la edad de la persona
    def get_age(self):
        return self._age
    
    #Obtenemos el dni de la persona
    def get_dni(self):
        return self._dni
    
    #Verificamos si la persona es Mayor de edad
    def is_older(self):
        if self._age >=18:
            return True
        else:
            return False

class Account:
    
    def __init__(self, holder="",amount=0):
        self._holder = holder
        self._amount = amount
    
    def set_holder(self,new_holder):
        self._holder= new_holder

    def set_amount(self,new_amount):
        if new_amount>=0:
            self.amount= new_amount
    
    def get_holder(self):
        return self._holder
    
    def get_amount(self):
        return self._amount
    
    def display(self):
        print(f"Titular: {self._holder}")
        print(f"Cantidad Disponible: {self._amount}")
    
    def deposit(self,amount):
        if amount > 0:
            self._amount +=amount
        
    def extraction(self,amount):
        if amount > 0:
            self._amount -= amount

class Triangle:

    #Inicializamos la clase, dandole el valor a sus cada lado del triángulo
    def __init__(self,side_1=5,side_2=3,side_3=2):
        self.side_1=side_1
        self.side_2=side_2
        self.side_3=side_3
    
    #Este método verifica que tipo de triángulo es
    def type_triangle(self):
        #Si tiene sus tres lados iguales es equilatero
        if(self.side_1==self.side_2 and self.side_1==self.side_3 and self.side_2==self.side_3):
            print("Triángulo Equilatero")
        
        #Si dos de sus lados son iguales y uno es diferente, es Isósceles    
        elif((self.side_1==self.side_2 and self.side_1 != self.side_3) or (self.side_1==self.side_3 and self.side_1 != self.side_2) or (self.side_2==self.side_3 and self.side_1 != self.side_2)):
            print("Triángulo Isósceles")
        #Y si ninguno de los lados del triángulo es igual es Escaleno    
        else:
            print("Triángulo Escaleno ")

    #Este método nos devuelve el lado mayor del triángulo
    def long_side(self):
        if self.side_1>self.side_2 and self.side_1>self.side_3:
            print(f"El lado 1 es el mayor, mide {self.side_1}")
        elif self.side_2>self.side_1 and self.side_2>self.side_3:
            print(f"El lado 2 es el mayor, mide {self.side_2}")
        else:
            print(f"El lado 3 es el mayor, mide {self.side_3}")

