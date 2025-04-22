document.addEventListener("DOMContentLoaded", function () {
    let footer = document.querySelector("footer");
    let currentYear = new Date().getFullYear();
    footer.textContent = `© ${currentYear} Ferrari`;
});