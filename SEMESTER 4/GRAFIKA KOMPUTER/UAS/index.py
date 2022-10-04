from matplotlib import pyplot as plt
import math

# Func View
def func_view():
    print("Menu Jajar Genjang")
    print("1. Translasi")
    print("2. Scalling")
    print("3. Rotasi")

# Func Create X and Y ( Cartesius )
def get_cartesious(cx1, cy1, cx2, cy2):
    
    x_axis_x = [cx1,cy1]
    x_axis_y = [0,0]

    y_axis_x = [0,0]
    y_axis_y = [cx2,cy2]

    plt.plot(x_axis_x, x_axis_y, color = 'k')
    plt.plot(y_axis_x, y_axis_y, color = 'k')
    plt.grid()
    plt.show()

# Func Translasi
def func_translation(Ta, Tb):
    x_values = [(x1 + Ta), (x2 + Ta), (x3 + Ta), (x4 + Ta), (x1 + Ta)]
    y_values = [(y1 + Tb), (y2 + Tb), (y3 + Tb), (y4 + Tb), (y1 + Tb)]
    plt.plot(x_values, y_values, marker='o')

# Func Rotasi
# Rotasi 90 derajat dengan pusat (a, b): (x,y) maka (-y + a + b, x – a + b)
# Rotasi 180 derajat dengan pusat (a,b) : (x,y) maka (-x -2a, -y +2b)
# Rotasi sebesar -90 derajat dengan pusat (a, b) : (x, y) maka (y – b + a, -x + a + b)
# Rotasi sebesar 90 derajat dengan pusat (0, 0) : (x, y) maka (-y,x)
# Rotasi 180 derajat dengan pusat (0,0) : (x, y) maka (-x, -y)
# Rotasi sebesar -90 derajat dengan pusat (0,0) : (x, y) maka (y, -x)
def func_rotation(N, Xp, Yp):
    sin = float(math.sin( N )) 
    cos  = float(math.cos( N ))
    
    x1a = (Xp + ((( x1 - Xp )*cos)-((y1 - Yp)*sin)))
    y1a = (Yp + ((( x1 - Xp )*sin)+((y1 - Yp)*cos)))
    
    x2a = (Xp + ((( x2 - Xp )*cos)-((y2 - Yp)*sin)))
    y2a = (Yp + ((( x2 - Xp )*sin)+((y2 - Yp)*cos)))
    
    x3a = (Xp + ((( x3 - Xp )*cos)-((y3 - Yp)*sin)))
    y3a = (Yp + ((( x3 - Xp )*sin)+((y3 - Yp)*cos)))
    
    x4a = (Xp + ((( x4 - Xp )*cos)-((y4 - Yp)*sin)))
    y4a = (Yp + ((( x4 - Xp )*sin)+((y4 - Yp)*cos)))
    
    x_values = [x1a, x2a, x3a, x4a, x1a]
    y_values = [y1a, y2a, y3a, y4a, y1a]
    plt.plot(x_values, y_values, marker='o')

# Func Scalling
def func_scalling(K, M, N):
    
    x1a = (((K*(x1-M))+(0*(x1-M))) + M )
    y1a = (((0*(y1-N))+(K*(y1-N))) + N )
    
    x2a = (((K*(x2-M))+(0*(x2-M))) + M )
    y2a = (((0*(y2-N))+(K*(y2-N))) + N )
    
    x3a = (((K*(x3-M))+(0*(x3-M))) + M )
    y3a = (((0*(y3-N))+(K*(y3-N))) + N )
    
    x4a = (((K*(x4-M))+(0*(x4-M))) + M )
    y4a = (((0*(y4-N))+(K*(y4-N))) + N )
    
    x_values = [x1a, x2a, x3a, x4a, x1a]
    y_values = [y1a, y2a, y3a, y4a, y1a]
    plt.plot(x_values, y_values, marker='o')

# Create Variabel Cartesius
print("Masukan Koordinat Cartesius")

cx1 = float(input("Cartesius X1 : ")) # -X
cy1 = float(input("Cartesius Y1 : ")) # Y
cx2 = float(input("Cartesius X2 : ")) # X
cy2 = float(input("Cartesius Y2 : ")) # -Y

print("Masukan Koordinat Jajar Genjang")

x1 = float(input("Coordinate x1 : ")) # Titik A(x1, y1)
y1 = float(input("Coordinate y1 : ")) # Titik A(x1, y1)
x2 = float(input("Coordinate x2 : ")) # Titik B(x2, y2)
y2 = float(input("Coordinate y2 : ")) # Titik B(x2, y2)
x3 = float(input("Coordinate x3 : ")) # Titik C(x3, y3)
y3 = float(input("Coordinate y3 : ")) # Titik C(x3, y3)
x4 = float(input("Coordinate x4 : ")) # Titik D(x4, y4)
y4 = float(input("Coordinate y4 : ")) # Titik D(x4, y4)
ulangi = "y"

while ulangi == "y":

    # Create Line By Coordinate (Normal)
    x_values = [x1, x2, x3, x4, x1]
    y_values = [y1, y2, y3, y4, y1]
    plt.plot(x_values, y_values, marker='o')

    func_view()
    
    menu = int(input("Pilih Menu : "))
    
    if menu == 1:
        # Create Line By Coordinate ( Translasi )
        # Variable Translasi
        Ta = float(input(" Ta : "))
        Tb = float(input(" Tb : "))
        func_translation(Ta, Tb)

        
    elif menu == 2:
        # Create Line By Coordinate ( Scalling )
        K = float(input(" K (SKALA) : "))
        N = float(input(" N (TITIK) : "))
        M = float(input(" M (TITIK) : "))
        func_scalling(K, M, N)
        
    elif menu == 3:
        # Create Line By Coordinate ( Rotasi )
        N = float(input(" N (ROTASI) : "))
        X = float(input(" X (TITIK) : "))
        Y = float(input(" Y (TITIK) : "))
        func_rotation(N, X, Y)

    else :
        print("Menu Tidak Sedia")
    
    get_cartesious(cx1, cy1, cx2, cy2)
    
    ulangi = input("Mulai lagi (y/n) ? : ")