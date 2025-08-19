package PrimerosEjercicios;

public class TallerJavaaaCasoProp {
    public static void main(String[] args) {
        // datos del viaje:
        double d1 = 50.0;
        double d2 = 58.5;
        double d3 = 20.2;

        double t1 = 2.9;
        double t2 = 1.4;
        double t3 = 1.8;

        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;

        double precioLitro = 1.35;
        double masaCargaKg = 1350;
        double largo = 3.0;
        double ancho = 1.2;
        double alto = 1.4;

        double p1 = 2.6;
        double p2 = 2.8;
        double p3 = 2.1;
        double deprecPorKm = 0.10;
        double volCamionM3 = 10.0;
        double galPorLitro = 0.264190;

    // Velocidades y Rendimiento:
        double v1 = d1 / t1;
        double v2 = d2 / t2;
        double v3 = d3 / t3;
        double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);
        double conv = vprom / 3.6;

        System.err.println("V1 es: " + v1);
        System.err.println("V2 es: " + v2);
        System.err.println("V3 (km/h) es: " + v3);
        System.err.println("Vprom (km/h) es: " + vprom);
        System.err.println("Vprom (m/s) es: " + conv);
    // -- Rendimiento por Tramo y total (Km/L):
        double kml1 = d1 / l1;
        double kml2 = d2 / l2;
        double kml3 = d3 / l3;
        double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);

        System.err.println("kml1 es: " + kml1);
        System.err.println("kml2 es: " + kml2);
        System.err.println("kml3 es: " + kml3);
        System.err.println("kmltotal es: " + kmltotal);
    
    // Costos Directos:
        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = (p1 + p2 + p3);
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = costoDirecto / (d1 + d2 + d3);

        System.err.println("costoComb es: " + costoComb);
        System.err.println("deprec es: " + deprec);
        System.err.println("peajes es: " + peajes);
        System.err.println("costoDirecto es: " + costoDirecto);
        System.err.println("costoPorKm es: " + costoPorKm);

    // Volumen, densidad y ocupación:
        double volumenM3 = largo * ancho * alto;
        double densidad = masaCargaKg / volumenM3;
        double ocupacion = volumenM3 / volCamionM3;

        System.err.println("volumenM3 es: " + volumenM3);
        System.err.println("densidad es: " + densidad);
        System.err.println("ocupacion es: " + ocupacion);

    
    // Emisiones de CO2:
        double fco2 = 2.95;
        double co2Total = (l1 + l2 + l3) * fco2;
        double co2PorKm = (co2Total) / (d1 + d2 + d3);

        System.err.println("co2Total es: " + co2Total);
        System.err.println("co2PorKm es: " + co2PorKm);

    // Conversiones y normalización:
        double vmsprom = vprom * 1000 / 3600;
        double galTot = (l1 + l2 + l3) * galPorLitro;
        double vmin = 10;
        double vmax = 20;
        double vnorm = (vprom - vmin) / (vmax - vmin);

        System.err.println("vmsprom es: " + vmsprom);
        System.err.println("galTot es: " + galTot);
        System.err.println("vnorm es: " + vnorm);
        
    
    // Promedios y Dispersion:

        double vmedia = (v1 + v2 + v3) / (3);
        var sigma = Math.sqrt(((v1 - vmedia) * (v1 - vmedia)+(v2 - vmedia) * (v2 - vmedia)+(v3 - vmedia) * (v3 - vmedia)) / 3);
        var vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

        System.err.println("vmedia es: " + vmedia);
        System.err.println("sigma es: " + sigma);
        System.err.println("vpond_t es: " + vpond_t);

    // Interpolacion Lineal (mantenimiento):
        double va = 30;
        double vb = 80;
        double ca = 0.09;
        double cb = 0.003;
        double cvprom = (ca) + (cb - ca) * (vprom - va) / (vb - va);
        double costoMant = cvprom * (d1 + d2 + d3);

        System.err.println("cvprom es: " + cvprom);
        System.err.println("costoMant es: " + costoMant);

    // Modelo Polinomico de rendimiento:
        double a = 0.4;
        double b = 0.08;
        double c = 4.0;
        double v = vprom;
        double kmlv = a * Math.pow(v, 2) + b * v + c;
        double kmlModelo = kmlv;
        double litrosModelo = (d1 + d2 + d3) / kmlModelo;

        System.err.println("kmlModelo es: " + kmlModelo);
        System.out.println("litrosModelo es: " + litrosModelo);
        
    // Indic de eficiencia (score):
        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;
        double w4 = 0.25;
        
        double score = w1 * (1 / costoPorKm) + w2 * kmltotal + w3 * (1 / co2PorKm) + w4 * (1 / (1 + sigma));

        System.err.println("Score es: " + score);
    }
}
