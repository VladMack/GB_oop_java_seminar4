package Shields;

// Экземпляр Shield сокращает урон, наносимы орудием в shieldRatio раз

public abstract class Shield {
    public Double getShieldRatio() {
        return shieldRatio;
    }

    private Double shieldRatio; // cодержит коофициент, на который делится наносимый атакующим урон

    public Shield(Double shieldRatio) {
        this.shieldRatio = shieldRatio;
    }

//    public Double getRealDamage(Integer damage) {
//        return Double.valueOf(damage) / shieldRatio;
//    }

    @Override
    public String toString() {
        return shieldRatio.toString();
    }
}
