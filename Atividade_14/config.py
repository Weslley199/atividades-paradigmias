class Configuracao:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
        return cls._instance


config1 = Configuracao()
config2 = Configuracao()

print(config1 is config2)  
