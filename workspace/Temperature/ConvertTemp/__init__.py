start = 0
end = 19
increment = 1
def main():   
    
    print('Converting Celsius to Fahrenheit')
    print( 'between 0 and 19 degrees Celsius.')
    

    #convert celsius input to farenheit using loop
    for Celsius in range (start, end, increment):
        Farenheit = (9 / 5) * Celsius + 32
        print(Celsius, '\t', format(Farenheit, '.1f'))
main()