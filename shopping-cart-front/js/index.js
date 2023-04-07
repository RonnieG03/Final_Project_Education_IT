const money = new Intl.NumberFormat(undefined,{
    style: 'currency',
    currency: 'ARS',
    minimumFractionDigits: 2
});

const listProduct = async() => {
	try {
		const response = await fetch('http://localhost:8080/api/v1/products/');
	
		console.log(response);

		// Si la respuesta es correcta
		if(response.status === 200){
			const datos = await response.json();
			
			let products = '';
			datos.forEach(product => {
				products += `
            <div class="col">
                <div class="card ">
				<center><img src="${product.image} " class="card-img-responsive" alt="${product.name}" width="140px" height="180px"></center>
                  <div class="card-body">
                    <h5 class="card-title text-center text-primary">${product.name}</h5>
                    <p class="card-text">${product.description}</p>
                    <h5 class="card-text">${money.format(product.price)}</h5>
					<h6 class="card-text">Stock disponible
						<p class="card-text">${product.amount}</p>
					</h6>
                    <a href="#" class="btn btn-primary">Agregar al carrito</a>
                  </div>
                </div>
              </div>`;
			});

			document.getElementById('cardBody_Products').innerHTML = products;

		} else {
			console.log('Hubo un error y no sabemos que paso');
		}

	} catch(error){
		console.log(error);
	}

}

listProduct();
