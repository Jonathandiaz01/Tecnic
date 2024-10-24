// src/componentes/Formulario.js
import React, { useState } from 'react';
import './Formulario.css'; // Asegúrate de importar los estilos CSS

function Formulario() {
    const [tipoProducto, setTipoProducto] = useState('');
    const [marca, setMarca] = useState('');
    const [color, setColor] = useState('');

    const handleProductoChange = (event) => {
        setTipoProducto(event.target.value);
        setMarca('');
        setColor('');
    };

    return (
        <form>
            <div>
                <label>Nombre:</label>
                <input type="text" name="nombre" />
            </div>
            <div>
                <label>Apellido:</label>
                <input type="text" name="apellido" />
            </div>
            <div>
                <label>Dirección:</label>
                <input type="text" name="Dirección" />
            </div>

            <div>
                <label>Ciudad:</label>
                <input type="text" name="Ciudad" />
            </div>

            <div>
                <label>Telefono:</label>
                <input type="text" name="Telefono" />
            </div>

            <div>
                <label>Correo:</label>
                <input type="text" name="Correo" />
            </div>

            <div>
                <label>Cedula:</label>
                <input type="text" name="Cedula" />
            </div>


            <h3>Detalles de Pedido</h3>
            <div>
                <label>Tipo de Producto:</label>
                <select value={tipoProducto} onChange={handleProductoChange}>
                    <option value="">Seleccione...</option>
                    <option value="forro">Forro</option>
                    <option value="audifonos">Audífonos</option>
                    <option value="cargador">Cargador</option>
                </select>
            </div>

            {tipoProducto && (
                <div>
                    <div>
                        <label>Marca:</label>
                        <select value={marca} onChange={(e) => setMarca(e.target.value)}>
                            <option value="">Seleccione una marca...</option>
                            <option value="apple">Apple</option>
                            <option value="samsung">Samsung</option>
                            <option value="xiaomi">Xiaomi</option>
                        </select>
                    </div>

                    <div>
                        <label>Color:</label>
                        <select value={color} onChange={(e) => setColor(e.target.value)}>
                            <option value="">Seleccione un color...</option>
                            <option value="rojo">Rojo</option>
                            <option value="negro">Negro</option>
                            <option value="blanco">Blanco</option>
                            <option value="estrella">Estrella</option>
                        </select>
                    </div>
                </div>
            )}

            <button type="submit">Enviar</button>
        </form>
    );
}

export default Formulario;
