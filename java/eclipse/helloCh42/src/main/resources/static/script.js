const url = "/api/v1/users";

const getPerson = async (url) => {
    const loader = document.getElementById('loader');
    try {
        loader.style.display = 'flex'; // Show loader
        const response = await fetch(url);
        const users = await response.json();

        const listPeople = users.map( ({firstName, lastName, avatar, id, email}) => {
            return `
                <div class="col-lg-3 col-md-4 col-sm-5">
                    <div class="card m-2 rounded shadow-sm">
                        <div class="card-body"><strong>${firstName} ${lastName}</strong></div>
                        <img src="${avatar}" class="card-img-top" alt="${firstName}">
                        <div class="card-body">${id}</div>
                        <div class="card-body">${email}</div>
                    </div>                
                </div>
            `;
        });

        document.querySelector("#list-container").innerHTML = listPeople.join("");

    } catch (exception) {
        console.error("Error", exception);

    } finally {
        loader.style.display = 'none'; // Hide loader
    }
};

console.log(getPerson(url));
getPerson(url);
