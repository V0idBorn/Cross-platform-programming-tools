import solution

txtFile = "Lab_8/result.txt"
binFIle = "Lab_8/result.bin"
solution.solution(txtFile , binFIle )

print(f"Containtmant of file {txtFile} is:\n{solution.read_txt(txtFile)}")

solution.read_binary(binFIle)
