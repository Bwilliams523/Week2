def exceptioncontrol():
    yoursmart=0
    while(yoursmart==0):
        try:
            a=int(input("Tell Me Your Age As An Integer"))
            print("You Were Born In The Year", 2015-a)

    except:
        print("You Did Not Enter An Integer")
        
exceptioncontrol()       
