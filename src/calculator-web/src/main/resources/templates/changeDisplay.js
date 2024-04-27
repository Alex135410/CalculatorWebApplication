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

const form = document.getElementById('calculatorForm');

form.addEventListener('submit', (event) => {
    event.preventDefault(); // Prevent default form submission behavior

    // Assuming traditional form submission with FormData
    const formData = new FormData(form);

    fetch('/calculate/add', { // Replace with your actual endpoint
        method: 'POST',
        body: formData
    })
        .then(response => response.json()) // Assuming JSON response
        .then(data => {
            updateDisplay(); // Call updateDisplay after successful submission
        })
        .catch(error => {
            console.error('Error submitting form:', error);
        });
});