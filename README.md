# ParserProjectCS4450

## Team Members
Ashton Hess, Chase Morgan, Jayson Ashford

## Requirements
See FS2021_Parser Project Description.pdf for project requirements.

## Description 
For our project, we implemented a partial Python parser in Java using context free grammars and the support of ANTLR, a parser generator tool. 

The grammar for our parser is located in the antlr.g4 file. This grammar describes the language in which the parser is able to walk and generate a parse tree from. This grammar only covers specific features of the Python language, and is a not a complete grammar for Python. The code below is test code that is able to be parsed with our grammar. This test file is a good place to start if you want to become farmiliar with what features of Python our grammar covers.

When the program is run, a parse tree is generated and outputted into the console. This is an easy way to view the tree, as children and parent node relations are easily identified with the tabs of seperation. 

## Setup
To set up, first you need IntelliJ IDE.  You will also need a copy of JDK 8 installed on your computer (or any other form of running a Java app, we used JDK 8 because this is what is used in 3330). You can find this on Oracle's website. Then, open the IDE and create a new project from a version control system. Use the link to this repo to clone the project. Then, in the IntelliJ IDE go to preferences->plugins->marketplace. Here, you will install the ANTLR 4 plugin. Once installed, you may have to restart your IDE. Then, open the project you cloned. Next, you will need to define a run configuration. A screenshot of the settings we used is provided below. Run the program. This will output a large string of the parse tree for the input file "testdata.txt". This file contains the code to parse. 

Some other documentation for getting setup:
https://docs.google.com/document/d/1gQ2lsidvN2cDUUsHEkT05L-wGbX5mROB7d70Aaj3R64/edit#


## Test Code

```

# Pokemon master name
name = "Ash Ketchum"

# Pokemon Health Points
charmender_HP = 110
squirtle_HP = 125
bulbasaur_HP = 150

# Pokemon Attack Points
charmender_attack = 40
squirtle_attack = 35
bulbasaur_attack = 25

turn = 1

# Turn-based attack loop, default starts with charmender (turn = 1)
# To change default to Squirtle change set 'turn' to 0
while charmender_HP > 0 and squirtle_HP > 0:
    if turn == 1:
        squirtle_HP -= charmender_attack
        print("Charmender did "+str(charmender_attack)+" damage")
        print("Squirtle got hurt :'( HP is: "+str(squirtle_HP))
        turn = 0
    else:
        charmender_HP -= squirtle_attack
        print("Squirtle faught back and did "+str(squirtle_attack)+" damage")
        print("Charmender got bitten! HP is: "+str(squirtle_HP))
        turn = 1

# Print winner pokemon
if charmender_HP >= 1:
    print(name+"'s Charmender won!")
elif squirtle_HP >=1:
    print(name+"'s Squirtle won!")
else:
    print("Something went wrong!!!")

#Find primes in a given interval
begin = 5
end = 25
prime_counter = 0
for num in range(begin, end):
    if(num > 0):
        if(num == 2):
            print("Prime: "+str(num))
        for i in range(2, int(num/2)+2):
            if (num%i==0):
                break
            else:
                print("Prime: "+str(num))
                break


# Some simple equations
eq1 = 2 * -5 + 20
print("EQ1: "+str(eq1))
if(eq1 != 0):
    print("eq1 output not equal to 0")
eq2 = -2 * 3 / 12
print("EQ2: "+str(eq2))


# Uncomment this code block below for BONUS (Syntax error)
# This is just a simple example...
#if(eq2 == 0)
#    print("This code shouldn't run")
#else
#    print "this one as well!"


```


