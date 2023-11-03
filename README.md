# Tugas-Praktikum-Modul-4
# PRAKTIKUM MODUL 4 BLIND SEARCH
# 1.	Tentukan bagaimana algoritma BFS di atas dapat menentukan node ke 8, 6, dan 7!
a.	Inisialisasi
Semua node dalam graf diberi warna WHITE (belum dikunjungi), kecuali node awal (node 3) yang diberi warna GRAY. Jarak dari Node awal (Node 3) disetel ke 0, dan predecessor (Node sebelumnya) diatur ke null. 
b.	Iterasi 1
node 3 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 4 dan Node 2) ditambahkan ke dalam antrean.
c.	Iterasi 2
Node 4 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 3, Node 5, dan Node 6) ditambahkan ke dalam antrean.
d.	Iterasi 3
Node 2 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 1 dan Node 3) ditambahkan ke dalam antrean.
e.	Iterasi 4
Node 5 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 4, Node 6, dan Node 7) ditambahkan ke dalam antrean.
f.	Iterasi 5
Node 1 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 2) ditambahkan ke dalam antrean.
g.	Iterasi 6
Node 6 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 4, Node 5, dan Node 7) ditambahkan ke dalam antrean.
h.	Iterasi 7
Node 7 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 5, Node 6, dan Node 8) ditambahkan ke dalam antrean.
i.	Iterasi 8
Node 4 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 3) ditambahkan ke dalam antrean.
j.	Iterasi 9
Node 8 (warna GRAY) dihapus dari antrean, dan tetangga-tetangganya (Node 6, Node 7) ditambahkan ke dalam antrean.
k.	Iterasi 10
Antrean kosong, dan pencarian BFS selesai.
algoritma BFS, kita memiliki informasi jarak dan predecessor dari setiap Node ke Node awal (Node 3).
- Jarak dari Node 3 ke Node 8 adalah 5, dengan Node predecessor 8 adalah 7, 6, 5, 4, 3.
- Jarak dari Node 3 ke Node 6 adalah 3, dengan Node predecessor 6 adalah 7, 5, 4, 3.
- Jarak dari Node 3 ke Node 7 adalah 4, dengan Node predecessor 7 adalah 5, 4, 3.

# 2.	Ubahlah method static void main sehingga bentuk tree seperti Gambar 4.4 dapat dibentuk. Kemudian tentukan bagaimana algoritma BFS dapat menemukan node 5!
Langkah-langkah algoritma BFS untuk menemukan Node 5 dalam struktur graf yang diwakili oleh `AdjacencyList2`:
a.	Inisialisasi Node 0 (start node) sebagai Node awal dan tandai sebagai "GRAY" untuk menunjukkan bahwa Node 0 sedang diproses. Set distance dari Node 0 menjadi 0.
b.	Node 0 dimasukkan ke dalam antrian (queue) untuk diproses lebih lanjut.
c.	Lakukan loop BFS hingga antrian (queue) kosong dengan mengeluarkan node pertama dari antrian.
d.	Memeriksa semua tetangga dari node yang belum diproses.
e.	Semua node tetangga yang belum diproses ditandai, lalu atur jarak tetangga sebesar satu satuan dari node dan memasukkan node tetangga sebagai antrian untuk diproses setelah node sebelumnya.
f.	Lakukan pengulangan langkah c sampai e hingga semua node diproses.
g.	Algoritma BFS selesai

# 3.	Ubahlah method static void main sehingga bentuk tree seperti Gambar 4.5 dapat dibentuk. Kemudian tentukan bagaimana algoritma BFS dapat menemukan node 9!
a.	Langkah 0: Inisialisasi
Semua simpul diwarnai putih (WHITE) dan memiliki jarak tak terhingga (Infinity). Semua simpul memiliki predecessor yang diatur ke null.
b.	Langkah 1: Pilih simpul awal dan inisialisasi
Pilih simpul awal, pada node 1 lalu tandai node 1 sebagai sedang dieksplorasi (GRAY). Setel jarak Node 1 menjadi 0 karena itu adalah titik awal. Predecessor Node 1 diatur ke null karena ini adalah simpul awal.
c.	Langkah 2: Mulai eksplorasi dengan BFS
Simpan Node 1 ke dalam antrian (queue) untuk memulai eksplorasi dari sana.
d.	Langkah 3: Eksplorasi simpul dari antrian
•	Keluarkan node 1 dari antrian, lalu temukan semua simpul terhubung dengan node 1 yang belum dieksplorasi, yaitu node 2, 3, dan 4.
•	Eksplorasi simpul node 2 dengan menandai node 2 sebagai sedang dieksplorasi (GRAY). Lalu mengukur jarak node 2 dari node 1 dan simpan node 2 dalam antrian.
•	Eksplorasi simpul node 3 dengan menandai node 3 sebagai sedang dieksplorasi (GRAY). Lalu mengukur jarak node 3 dari node 1 dan simpan node 3 dalam antrian
•	Eksplorasi simpul node 4 dengan menandai node 4 sebagai sedang dieksplorasi (GRAY). Lalu mengukur jarak node 4 dari node 1 dan simpan node 4 dalam antrian


# 4.	Ubahlah kode program di atas sehingga bentuk tree seperti Gambar 6 dapat dibentuk. Kemudian tentukan bagaimana algoritma BFS dapat menemukan node C!
Langkah-langkah algoritma BFS (Breadth-First Search) 
1.	Inisialisasi
Semua simpul dalam graf diberi warna "WHITE" (belum dijelajahi). Jarak dari simpul awal F ke semua simpul lain diatur ke nilai tak terhingga dimana  setiap simpul tidak memiliki awalan.
2.	Mulai dari simpul awal F
Simpul F dipilih sebagai simpul awal penelusuran. Warna simpul F diubah menjadi "GRAY" (sedang dieksplorasi) untuk menunjukkan F adalah simpul awal sehingga jarak menjadi 0.
3.	Antrian (Queue)
Antrian digunakan untuk menyimpan simpul-simpul yang akan dieksplorasi
4.	Eksplorasi Simpul
Algoritma BFS akan melakukan iterasi melalui simpul-simpul dalam antrian secara berurutan.
5.	Simpul F dieksplorasi
Simpul F berwarna "GRAY" dan merupakan simpul saat ini yang sedang dieksplorasi dan kemudian memeriksa semua simpul tetangga dari simpul F yang terhubung melalui tepi (edge).
6.	Penjelajahan Simpul Tetangga
7.	Algoritma BFS akan memeriksa simpul-simpul tetangga yang terhubung dengan simpul F. Warna simpul tetangga diubah menjadi "GRAY," jaraknya diperbarui dengan jarak dari simpul saat ini (F) plus satu, dan simpul saat ini (F) diatur sebagai pendahulu dari simpul tetangga tersebut.
8.	Penambahan ke Antrian
Setelah memproses semua tetangga yang dapat dijangkau dari simpul F, simpul F diubah menjadi "BLACK" (selesai dieksplorasi) dan dikeluarkan dari antrian.
9.	Iterasi Lanjutan
Algoritma BFS akan terus melakukan iterasi melalui antrian hingga tidak ada simpul yang tersisa dalam antrian yang berwarna "GRAY." Pada saat ini, algoritma telah mengeksplorasi semua simpul yang dapat dijangkau dari simpul awal F.
10.	Mencari Node C
Setelah BFS selesai dieksekusi, metode `getShortestPath` (yang disertakan dalam kode program) untuk mencari jalur terpendek dari simpul awal F ke simpul C.
