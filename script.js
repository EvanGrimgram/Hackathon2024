function toggleTheme() {
    document.body.classList.toggle("light-theme");
}
function toggleDetails(eventElement) {
    eventElement.classList.toggle("expanded");
}
function openImageWithCaption(imageSrc, captionText) {
    const viewerUrl = `image-viewer.html?image=${encodeURIComponent(imageSrc)}&caption=${encodeURIComponent(captionText)}`;
    window.open(viewerUrl, '_blank');
}