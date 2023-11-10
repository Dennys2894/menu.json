document.addEventListener("DOMContentLoaded", function () {
  // Cargar el menú desde el archivo JSON
  fetch("menu.json")
    .then(response => response.json())
    .then(data => {
      const menuContainer = document.getElementById("menus");
      const menuItems = data.menuItems;

      // Crear elementos de menú y agregarlos al contenedor
      menuItems.forEach(item => {
        const menuItem = document.createElement("a");
        menuItem.href = item.url;
        menuItem.textContent = item.title;
        menuContainer.appendChild(menuItem);
      });
    })
    .catch(error => console.error("Error al cargar el menú:", error));
});

