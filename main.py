import os
from os import walk

def generate_test(variable_type, variable_name):
    output_file.write('\t@Test\n')
    output_file.write('\tpublic void testSetAndGet_' + variable_name + '() {\n')

    if (variable_type in ['Long', 'Integer', 'Double', 'BigDecimal']):
        output_file.write('\t\t' + variable_type + ' testData = ' + variable_type + '.valueOf(1);\n')
    elif variable_type == 'Boolean':
        output_file.write('\t\t' + variable_type + ' testData = ' + variable_type + '.valueOf(true);\n')
    else:
        output_file.write('\t\t' + variable_type + ' testData = new ' + variable_type + '(\"test\");\n')

    output_file.write('\t\t' + class_name + ' testClass = new ' + class_name + '();\n')
    output_file.write('\t\ttestClass.set' + variable_name[0].upper() + variable_name[1:] + '(testData);\n')
    output_file.write('\t\t' + variable_type + ' testResult = testClass.get'+ variable_name[0].upper() + variable_name[1:] + '();\n')
    output_file.write('\t\t' + 'Assert.assertEquals(testResult, testData);\n')
    output_file.write('\t}\n\n')

f = []
for (dirpath, dirnames, filenames) in walk("input/"):
    f.extend(filenames)
    break

for current_file_name in f:
    file = open("input/" + current_file_name, "r")
    class_name = current_file_name.split('.')[0]
    test_class_name = class_name + "Test"
    output_file = open("output/" + test_class_name + ".java", "w")

    for line in file:
        if('package' in line):
            output_file.write(line + '\n')
            output_file.write('import org.junit.Assert;' + '\n')
            output_file.write('import org.junit.Test;' + '\n')
            output_file.write('import org.junit.runner.RunWith;' + '\n')
            output_file.write('import org.mockito.junit.MockitoJUnitRunner;' + '\n\n')
            output_file.write('import java.math.BigDecimal;' + '\n\n')
            output_file.write('@RunWith(MockitoJUnitRunner.class)' + '\n')
            output_file.write('public class ' + test_class_name + ' {' + '\n\n')
        
        if ('private' in line):
            current_variable = line.split()
            variable_type = current_variable[1]
            variable_name = current_variable[2].replace(';', '')
            generate_test(variable_type, variable_name)

    output_file.write('}')
    output_file.close()

file.close()

