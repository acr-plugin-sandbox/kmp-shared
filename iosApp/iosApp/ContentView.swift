import SwiftUI
import Shared

struct ContentView: View {
    let name: String? = UserDefaults.standard.string(forKey: "name")

    var greeting: String { Greeting().greet(name: name) }

    var body: some View {
        Text(greeting)
            .padding()
    }
}
