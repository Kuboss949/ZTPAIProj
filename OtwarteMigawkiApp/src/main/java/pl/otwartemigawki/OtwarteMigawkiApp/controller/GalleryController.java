package pl.otwartemigawki.OtwarteMigawkiApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.otwartemigawki.OtwarteMigawkiApp.dto.ApiResponseDTO;
import pl.otwartemigawki.OtwarteMigawkiApp.service.GalleryService;

public class GalleryController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private GalleryService galleryService;

    @GetMapping("/gallery")
    public ApiResponseDTO getAllGalleries() {
        return null;
    }

    @GetMapping("/gallery/{galleryId}")
    public ApiResponseDTO getGalleryById(@PathVariable Integer galleryId) {
        return null;
    }

    @DeleteMapping("/gallery/{galleryId}")
    public ApiResponseDTO deleteGallery(@PathVariable Integer galleryId) {
        return null;
    }



}
