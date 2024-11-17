package lesson1.newTest.config;

import lesson1.newTest.Components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.ArrayList;

@Component
@Scope()
public class Info {
    private List<Components> components = new ArrayList<>();
    private String OS;
    private String OSVersion;

@Autowired
    private void setComponents (List<Components> components) { this.components = components; }

    public void start() {
        for (Components comp: components) {
            System.out.println("Компонент: " + comp.getName() +
                    "\nЦена: " + comp.getPrice() + "\n");
        }
        System.out.println("Операционная система: " + OS
                + "\nВерсия ОС: " + OSVersion);
    }

// Геттеры и сеттеры
    public String getOS() { return OS; }
    @Value("${Info.OS}")
    public void setOS(String OS) { this.OS = OS; }
    @Value("${Info.OSVersion}")
    public void setOSVersion(String OSVersion) { this.OSVersion = OSVersion; }
    public String getOSVersion() { return OSVersion; }

// Ининициализая и уничтожение
    @PostConstruct
    private void init() { System.out.println("Просматриваем компоненты..."); }
    @PreDestroy
    private void destroy() { System.out.println("Просмотр закончен."); }
}
