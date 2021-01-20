public interface Subjekt {
    public abstract void registerBeobachter(Beobachter beobachter);
    public abstract void deleteBeobachter(Beobachter beobachter);
    public abstract void messageAllBeobachter();
}
