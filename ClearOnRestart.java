private void Form1_Load(object sender, EventArgs e)
{
    // The path to the Recycling Bin
    string recycleBin = Path.Combine(Environment.GetEnvironmentVariable("SystemRoot"), "System32", "cmd.exe");

    // The command to clear the Recycling Bin
    string clearRecycleBin = "/C echo Y|cleanmgr /sagerun:1";

    // Start the process to clear the Recycling Bin
    Process process = new Process();
    process.StartInfo.FileName = recycleBin;
    process.StartInfo.Arguments = clearRecycleBin;
    process.StartInfo.WindowStyle = ProcessWindowStyle.Hidden;
    process.Start();

    // Close the application
    this.Close();
}