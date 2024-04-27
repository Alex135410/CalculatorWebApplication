function updateDisplay() {
    const displayElement = document.getElementById('display');
    displayElement.innerHTML = ''; // Clear previous content

    const operation = displayElement.dataset.operation;
    const result = displayElement.dataset.result;

    if (operation && result) {
        const operationElement = document.createElement('p');
        operationElement.textContent = operation + ' =';
        displayElement.appendChild(operationElement);

        const resultElement = document.createElement('p');
        resultElement.textContent = result;
        displayElement.appendChild(resultElement);
    } else {
        // Set default message (assuming 'defaultMessage' is set in the model)
        const messageElement = document.createElement('p');
        messageElement.textContent = model.getAttribute('defaultMessage');
        displayElement.appendChild(messageElement);
    }
}

