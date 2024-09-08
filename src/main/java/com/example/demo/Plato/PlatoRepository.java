package com.example.demo.Plato;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

@Repository
public class PlatoRepository {
    private List<Plato> platos = new ArrayList<Plato>();
    List<Plato> findAll(){
        return platos;
    }
    @PostConstruct
    public void init(){
        //      ------------Empanadas------------
        platos.add(new Plato("Empanada de Carne Cortada a Cuchillo"
            , "Docena de Empanadas de Carne Cortada a Cuchillo"
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Jamon y Queso"
            , "Docena de Empanadas de Jamon y Queso"
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Carne Tradicional"
            , "Relleno de carne de res sazonada con cebolla, pimientos, huevo duro y aceitunas, envuelta en una masa crujiente al horno."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Pollo y Espinaca"
            , "Pechuga de pollo desmenuzada, mezclada con espinacas salteadas y queso crema."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Humita"
            , "Rellena de una mezcla cremosa de maíz, queso y especias."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada Caprese (vegetariana):"
            , "Relleno de queso mozzarella, tomate cherry y hojas frescas de albahaca, sazonada con aceite de oliva y pimienta."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Espinaca y Ricota (vegetariana)"
            , "Espinacas frescas mezcladas con queso ricota y un toque de nuez moscada para darle más sabor."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Lentejas y Champiñones (vegana)"
            , "Relleno de lentejas cocidas con champiñones salteados, cebolla, ajo y un toque de pimentón ahumado."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        platos.add(new Plato("Empanada de Vegetales Asados (vegana)"
            , "Una mezcla de calabacín, pimientos rojos, cebolla y berenjena asados, aderezados con hierbas frescas y un poco de aceite de oliva."
            , Tipo.EMPANADA
            , 2500D
            , 25
            , true));
        //      ------------Pizzas------------
        platos.add(new Plato("Pizza Pepperoni"
            , "Salsa de tomate, queso mozzarella y rodajas de pepperoni, con un toque de orégano."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Cuatro Quesos"
            , "Mezcla de quesos mozzarella, parmesano, gorgonzola y provolone, sobre una base de salsa blanca o tomate."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Muzzarella"
            , "Sin Descripcion"
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Pollo y Pesto"
            , "Salsa pesto, pechuga de pollo a la parrilla, queso mozzarella y tomate cherry."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Jamon y Morrones"
            , "Con salsa de tomate, jamón cocido, pimientos asados y queso mozzarella."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Tropical"
            , "Salsa de tomate, queso mozzarella, jamón ahumado, piña jugosa, pimiento rojo en tiras y cebolla morada."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Margarita (Vegetariana)"
            , "Salsa de tomate, mozzarella fresca, rodajas de tomate, hojas de albahaca y un chorrito de aceite de oliva."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Champiñones y Espinacas (vegetariana)"
            , "Salsa de tomate, queso mozzarella, champiñones frescos, espinacas salteadas y un toque de ajo y aceite de oliva."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Vegetales Asados (vegana)"
            , "Masa vegana cubierta con salsa de tomate, berenjenas, calabacín, pimientos asados y cebolla caramelizada."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Pizza Hummus y Rúcula (vegana)"
            , "Base de hummus en lugar de salsa de tomate, acompañada de tomates cherry, rúcula fresca y aceitunas negras."
            , Tipo.PIZZA
            , 1500D
            , 20
            , true));
        //      ------------Hamburguesas------------
        platos.add(new Plato("Hamburguesa Clásica con Queso"
            , "Carne de res jugosa, queso cheddar, lechuga, tomate, cebolla y pepinillos en un pan de hamburguesa clásico."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa BBQ con Cebolla Caramelizada"
            , "Carne de res con salsa BBQ, cebolla caramelizada, queso cheddar y lechuga en pan brioche."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa de Pollo a la Parrilla con Palta (celiaco)"
            , "Pechuga de pollo a la parrilla, palta, tomate y lechuga en un pan sin gluten."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa de Ternera con Champiñones Salteados (celiaco)"
            , "Carne de res con champiñones salteados, queso suizo y espinacas en pan sin gluten."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa de Garbanzos y Espinacas (vegetariana)"
            , "Hamburguesa a base de garbanzos, espinacas, zanahorias y especias, con hummus, tomate y lechuga en pan integral."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa de Portobello a la Parrilla (vegetariana)"
            , "Hongo portobello a la parrilla con queso feta, tomate, cebolla roja y pesto en pan de hamburguesa."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa de Lentejas y Remolacha (vegana)"
            , "Hamburguesa vegana a base de lentejas, remolacha, zanahorias y especias, con aguacate, tomate y lechuga en pan vegano."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Hamburguesa de Berenjena y Garbanzos (vegana)"
            , "Hamburguesa hecha con berenjena asada y garbanzos triturados, sazonada con comino y cilantro, acompañada de salsa de tahini, tomate y rúcula."
            , Tipo.HAMBURGESA
            , 1500D
            , 20
            , true));
        //      ------------Acompañamientos------------
        platos.add(new Plato("Papas Fritas Caseras"
            , "Papas cortadas en tiras y fritas, con opción de condimentos como paprika, ajo en polvo y romero."
            , Tipo.ACOMPAÑANMIENTO
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Aros de Cebolla"
            , "Aros de Cebolla"
            , Tipo.ACOMPAÑANMIENTO
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Papas con Cheddar y Bacon Triturado"
            , "Deliciosas papas al horno o fritas, cubiertas con una generosa capa de queso cheddar derretido y trocitos crujientes de bacon triturado."
            , Tipo.ACOMPAÑANMIENTO
            , 1500D
            , 20
            , true));
        //      ------------Ensaladas------------
        platos.add(new Plato("Ensalada Mediterránea"
            , "Mezcla de tomates cherry, pepino, cebolla roja, aceitunas negras, queso feta y albahaca fresca. Aliñada con aceite de oliva, jugo de limón, sal y pimienta."
            , Tipo.ENSALADA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Ensalada César Vegetariana"
            , "Lechuga romana, crutones de pan integral, queso parmesano y aderezo César casero, sin anacardos para la versión vegana."
            , Tipo.ENSALADA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Ensalada de Papa y Huevos"
            , "Papas hervidas, huevos duros, cebolla morada y apio, mezclados con un aderezo de mayonesa ligera y mostaza"
            , Tipo.ENSALADA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Ensalada de Tomate y Palta"
            , "Tomates en rodajas y palta, acompañados de cebolla morada y albahaca. Aliñada con aceite de oliva, vinagre balsámico, sal y pimienta."
            , Tipo.ENSALADA
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Ensalada de Garbanzos con Espárragos"
            , "Garbanzos cocidos y espárragos blanqueados mezclados con cebolla roja, pimientos y cilantro. Aliñada con una vinagreta de limón y comino."
            , Tipo.ENSALADA
            , 1500D
            , 20
            , true));
        //      ------------Bebidas------------
        //! Hay que ver bien que hacer con las bebidas, asi que solo pongo esto por ahora
        platos.add(new Plato("Coca-Cola"
            , "Disponibles en 500ml, 1.5L y 2.25L"
            , Tipo.BEBIDA
            , 1500D
            , 20
            , true));
        //      ------------Postres------------
        platos.add(new Plato("Flan Casero con Dulce de Leche"
            , "Clásico flan de huevo, suave y cremoso, servido con una generosa porción de dulce de leche."
            , Tipo.POSTRE
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Alfajor"
            , "Dulce tradicional argentino compuesto por dos galletas suaves rellenas de dulce de leche y cubiertas con chocolate."
            , Tipo.POSTRE
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Chocotorta"
            , "Postre frío hecho con capas de galletitas de chocolate mojadas en café o leche, intercaladas con una mezcla de dulce de leche y queso crema."
            , Tipo.POSTRE
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Vigilante"
            , "Postre simple pero muy tradicional, que consiste en rodajas de queso (generalmente queso fresco) servidas con dulce de membrillo"
            , Tipo.POSTRE
            , 1500D
            , 20
            , true));
        platos.add(new Plato("Helado Artesanal"
            , "El helado es una de las estrellas de la gastronomía argentina, con sabores tradicionales como dulce de leche, chocolate amargo, frutilla y crema americana."
            , Tipo.POSTRE
            , 1500D
            , 20
            , true));
    }
}
