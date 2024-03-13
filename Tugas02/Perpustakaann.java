package Tugas02;

    public class Perpustakaann {
        String judul;
        String namaPenulis;
        String namaPenerbit;
        int jumlahHalaman;
        int tahunTerbit;
        String sinopsis;

    public Perpustakaann() {
    }

    public Perpustakaann(String judul, String namaPenulis, String namaPenerbit, int jumlahHalaman, int tahunTerbit, String sinopsis) {
        this.judul = judul;
        this.namaPenulis = namaPenulis;
        this.namaPenerbit = namaPenerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.sinopsis = sinopsis;
    }

    public void teknologi() {
        Perpustakaann b1 = new Perpustakaann("A Hands-On, Project-Based Introduction to Programming", "Eric Matthes", "No Starch Press", 544, 2019, "A comprehensive guide that introduces programming concepts through practical projects. Suitable for beginners.");
        b1.showType();
        Perpustakaann b2 = new Perpustakaann("A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "Prentice Hall", 464, 2008, "In-depth exploration of agile methodologies, focusing on software craftsmanship and development best practices.");
        b2.showType();
        Perpustakaann b3 = new Perpustakaann("The Lean Startup", "Eric Ries", "Crown Business", 336, 2011, "Groundbreaking approach to startup management, emphasizing iterative product development, validated learning, and continuous innovation.");
        b3.showType();
        Perpustakaann b4 = new Perpustakaann("An Integrated Approach to Online Marketing", "Simon Kingsnorth", "Kogan Page", 400, 2023, "Comprehensive guide to developing and implementing effective online marketing strategies, covering various digital channels and integration methods.");
        b4.showType();
        Perpustakaann b5 = new Perpustakaann("189 Programming Questions and Solutions", "Gayle McDowell", "CareerCup", 687, 2019, "Extensive resource for programming interview preparation, featuring a wide range of challenging questions and detailed solutions.");
        b5.showType();
    }

    public void filsafat() {
        Perpustakaann c1 = new Perpustakaann("A Brief History of Humankind", "Yuval Noah Harari", "Harper", 443, 2015, "Engaging narrative that traces the evolution of Homo sapiens from the Stone Age to the present, offering thought-provoking insights into human behavior and society.");
        c1.showType();
        Perpustakaann c2 = new Perpustakaann("A Counterintuitive Approach", "Mark Manson", "HarperOne", 224, 2016, "Provocative exploration of happiness and self-improvement, challenging conventional wisdom with practical advice on living a meaningful life.");
        c2.showType();
        Perpustakaann c3 = new Perpustakaann("Thinking, Fast and Slow", "Daniel Kahneman", "Farrar, Straus and Giroux", 499, 2011, "Fascinating examination of the two systems of human thinking, revealing the biases and shortcuts that influence decision-making.");
        c3.showType();
        Perpustakaann c4 = new Perpustakaann("Man's Search for Meaning", "Viktor E. Frankl", "Beacon Press", 184, 2006, "Profound memoir of survival and resilience in Nazi concentration camps, offering profound insights into the quest for meaning and purpose in life.");
        c4.showType();
        Perpustakaann c5 = new Perpustakaann("Meditations", "Marcus Aurelius", "Penguin Classics", 256, 2014, "Timeless collection of personal reflections and philosophical insights by the Roman Emperor, providing wisdom on living a virtuous and fulfilling life.");
        c5.showType();
    }

    public void sejarah() {
        Perpustakaann d1 = new Perpustakaann("Educated: A Memoir", "Tara Westover", "Random House", 334, 2018, "Compelling memoir of a woman who escapes her isolated upbringing through education, offering insights into resilience and self-discovery.");
        d1.showType();
        Perpustakaann d2 = new Perpustakaann("1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "Vintage Books", 541, 2005, "Revelatory exploration of indigenous civilizations in the Americas before European contact, challenging traditional narratives of history.");
        d2.showType();
        Perpustakaann d3 = new Perpustakaann("Nine Americans and Their Epic Quest for Gold", "Daniel James Brown", "Penguin Books", 404, 2013, "Riveting account of nine Americans who sought gold in the Klondike Gold Rush, revealing the triumphs and tragedies of their journey.");
        d3.showType();
        Perpustakaann d4 = new Perpustakaann("A Short History of Nearly Everything", "Bill Bryson", "Broadway Books", 544, 2003, "Entertaining and informative overview of scientific discoveries and the history of the universe, making complex concepts accessible to general readers.");
        d4.showType();
        Perpustakaann d5 = new Perpustakaann("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Harper", 443, 2015, "Insightful examination of the history of Homo sapiens, exploring the cognitive, agricultural, and scientific revolutions that shaped human civilization.");
        d5.showType();
    }

    public void agama() {
        Perpustakaann e1 = new Perpustakaann("The Power of Now: A Guide to Spiritual Enlightenment", "Eckhart Tolle", "New World Library", 236, 1997, "Inspiring guide to spiritual awakening and living in the present moment, offering practical techniques for inner peace and fulfillment.");
        e1.showType();
        Perpustakaann e2 = new Perpustakaann("A Practical Guide to Personal Freedom", "Don Miguel Ruiz", "Amber-Allen Publishing", 160, 1997, "Wisdom teachings on achieving personal freedom and happiness, based on ancient Toltec wisdom and principles.");
        e2.showType();
        Perpustakaann e3 = new Perpustakaann("The Celestine Prophecy: An Adventure", "James Redfield", "Warner Books", 246, 1993, "Adventure novel that unfolds nine insights about spiritual awakening and human consciousness, offering a new perspective on life.");
        e3.showType();
        Perpustakaann e4 = new Perpustakaann("Mindfulness Meditation in Everyday Life", "Jon Kabat-Zinn", "Hyperion", 304, 1994, "Practical guide to integrating mindfulness into daily activities, enhancing awareness and reducing stress.");
        e4.showType();
        Perpustakaann e5 = new Perpustakaann("The Alchemist", "Paulo Coelho", "HarperOne", 197, 1988, "Inspirational novel about following one's dreams and discovering the true meaning of life, through the journey of a young shepherd boy.");
        e5.showType();
    }

    public void psikologi() {
        Perpustakaann f1 = new Perpustakaann("The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "Crown Publishing Group", 352, 2012, "Celebration of introversion and its strengths in a society that values extroversion, offering insights for both introverts and extroverts.");
        f1.showType();
        Perpustakaann f2 = new Perpustakaann("Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk", "Penguin Books", 464, 2014, "Groundbreaking exploration of trauma and its effects on the brain, mind, and body, offering new approaches to healing.");
        f2.showType();
        Perpustakaann f3 = new Perpustakaann("Thinking, Fast and Slow", "Daniel Kahneman", "Farrar, Straus and Giroux", 499, 2011, "Examination of human thought processes and biases, revealing the interplay between intuitive and rational thinking.");
        f3.showType();
        Perpustakaann f4 = new Perpustakaann("Man's Search for Meaning", "Viktor E. Frankl", "Beacon Press", 184, 2006, "Profound exploration of finding meaning in life, based on the author's experiences in Nazi concentration camps.");
        f4.showType();
        Perpustakaann f5 = new Perpustakaann("An Easy & Proven Way to Build Good Habits", "James Clear", "Avery", 320, 2018, "Practical guide to building and maintaining good habits, based on scientific research and behavioral psychology.");
        f5.showType();
    }

    public void politik() {
        Perpustakaann g1 = new Perpustakaann("The Art of War", "Sun Tzu", "Wilder Publications", 94, 2009, "Timeless treatise on military strategy and tactics, offering insights into leadership, planning, and conflict resolution.");
        g1.showType();
        Perpustakaann g2 = new Perpustakaann("The Prince", "Niccolò Machiavelli", "CreateSpace IPP", 140, 2010, "Seminal work on political philosophy and governance, exploring the principles of leadership and statecraft.");
        g2.showType();
        Perpustakaann g3 = new Perpustakaann("How to Win Friends & Influence People", "Dale Carnegie", "Gallery Books", 288, 2009, "Classic guide to interpersonal skills and human relations, offering practical advice on building rapport and influencing others.");
        g3.showType();
        Perpustakaann g4 = new Perpustakaann("The 48 Laws of Power", "Robert Greene", "Penguin Books", 452, 2000, "Machiavellian exploration of power dynamics and manipulation, revealing strategies for attaining and maintaining control in various social and professional contexts.");
        g4.showType();
        Perpustakaann g5 = new Perpustakaann("The Federalist Papers", "Alexander Hamilton", "Signet Classics", 432, 2003, "Seminal collection of essays advocating for the ratification of the United States Constitution, offering insights into the principles of federalism and republican government.");
        g5.showType();
    }

    public void fiksi() {
        Perpustakaann h1 = new Perpustakaann("The Night Circus", "Erin Morgenstern", "Anchor Books", 528, 2012, "Enchanting tale of a magical competition between two young illusionists, set within a mysterious circus that only appears at night.");
        h1.showType();
        Perpustakaann h2 = new Perpustakaann("The Book Thief", "Markus Zusak", "Knopf", 552, 2005, "Heartbreaking story of a young girl living in Nazi Germany, who steals books to share the power of words and storytelling.");
        h2.showType();
        Perpustakaann h3 = new Perpustakaann("To Kill a Mockingbird", "Harper Lee", "Grand Central Publishing", 323, 2010, "Classic novel set in the racially charged atmosphere of 1930s Alabama, exploring themes of racial injustice and moral growth.");
        h3.showType();
        Perpustakaann h4 = new Perpustakaann("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 200, 2014, "Iconic portrayal of the American Dream and the Jazz Age, through the life of Jay Gatsby and his pursuit of wealth and love.");
        h4.showType();
        Perpustakaann h5 = new Perpustakaann("The Catcher in the Rye", "J.D. Salinger", "Back Bay Books", 277, 2001, "Seminal coming-of-age novel following Holden Caulfield's journey through adolescence, grappling with alienation and identity.");
        h5.showType();
    }

    public void showType() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + namaPenulis);
        System.out.println("Penerbit: " + namaPenerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah kata dalam sinopsis : " + hitungKata(sinopsis));
        System.out.println();
    }
    public int hitungKata(String sinopsis){
        return sinopsis.split(" ").length;   
  }

}

