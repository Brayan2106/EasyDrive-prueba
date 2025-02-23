package pe.edu.upc.easydrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.easydrive.entities.CentrosMedicos;

import java.util.List;

@Repository
public interface ICentrosMedicosRepository extends JpaRepository<CentrosMedicos, Integer> {
    @Query("Select c from CentrosMedicos c where c.Nombre like %:nombre%")
    public List<CentrosMedicos> buscar(@Param("nombre") String nombre);
}
