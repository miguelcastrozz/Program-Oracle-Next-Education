(() => {

    const btn = document.querySelector('[data-form-btn]');

    const createTask = (evento) => {
        evento.preventDefault(); /* Evita que el evento se ejecute por defecto haciendo que la página no se recargue automáticamente */

        const input = document.querySelector('[data-form-input]');/* Colocamos esto dentro de la función para que se ejecute cada vez que se haga click en el botón */
        const list = document.querySelector('[data-list]');
        const task = document.createElement('li'); /* createElement crea un elemento HTML */
        const taskContent = document.createElement('div');
        const titleTask = document.createElement('span');
        const value = input.value;

        input.value = ''; /* Para que el input se vacíe cada vez que se haga click en el botón */
        task.classList.add('card');
        titleTask.classList.add('task');/* Agregar una clase al elemento task */
        titleTask.innerText = value; /* Agregar el valor del input al elemento titleTask */

        taskContent.appendChild(checkComplete());
        taskContent.appendChild(titleTask);/* Agregar el elemento titleTask al elemento taskContent */
        task.appendChild(taskContent);
        task.appendChild(deleteIcon());
        list.appendChild(task);/* Al elemento list agregale un hijo */
    }
    
    const checkComplete = () => {
        const i = document.createElement('i');
        i.classList.add('far', 'fa-check-square', 'icon');
        i.addEventListener('click', completeTask); /* Agregar un evento al elemento i */
        return i;
    };

    const completeTask = (event) => {
        const element = event.target;/* Guarda el elemento (posición) que dispara el evento */
        element.classList.toggle('fas');
        element.classList.toggle('completeIcon');
        element.classList.toggle('far');
    };

    const deleteIcon = () => {
        const i = document.createElement('i');
        i.classList.add('fas', 'fa-trash-alt', 'trashIcon', 'icon');
        i.addEventListener('click', deleteTask);
        return i;
    };

    const deleteTask = (event) => {
        const parent = event.target.parentElement; /* Selecciona la tarjeta */
        parent.remove();
    };

    /* addEventListener: Escucha eventos, recibe dos parámetros: evento y ejecución */
    btn.addEventListener("click", createTask); /* evento es un objeto que contiene información sobre el evento, convertimos a una función anónima */

})()
